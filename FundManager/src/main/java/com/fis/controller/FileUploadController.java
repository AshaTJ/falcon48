package com.fis.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fis.fileuploaddownload.payload.Response;
import com.fis.fileuploaddownload.service.FileStorageService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FileUploadController {

  @Autowired private FileStorageService fileStorageService;

  @PostMapping("/uploadFile")
  public Response uploadFile(
      @RequestParam("file") MultipartFile file, @RequestParam("id") long id) {
    String fileName = fileStorageService.storeFile(file);

    String fileDownloadUri =
        ServletUriComponentsBuilder.fromCurrentContextPath()
            .path("/downloadFile/")
            .path(id + "_" + fileName)
            .toUriString();

    return new Response(fileName, fileDownloadUri, file.getContentType(), file.getSize());
  }

  @PostMapping("/uploadMultipleFiles")
  public List<Response> uploadMultipleFiles(
      @RequestParam("files") MultipartFile[] files, @RequestParam("id") long id) {
    return Arrays.asList(files)
        .stream()
        .map(file -> uploadFile(file, id))
        .collect(Collectors.toList());
  }
}
