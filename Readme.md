FIDiD : Re-Imagining FIS Investran KYC Process
===================
 
FIS InnovateIN48 2020

#### **Team Falcon48**
Prakash KG (e3010279), Jacob Jacob(e3011153), Ruby Thomas (e3010454), Asha TJ (e5616914)

Background
-------------
* **Investran** is an FIS solution for Private Equity firms to manage entire investment lifecycle of funds and accounting 
* Customers in context are Private Equity Firms/Fund Managers using Investran solution and their Investors/Limited Partners (LPs) consisting of pension funds, institutional accounts and wealthy individuals participating in different funds they manage
* FIS holds a major market share in the Private Equity solution space with Investran solution


Problem Statement
-------------
 
* KYC is mandatory before any investor is onboarded to a Private Equity Firm's platform. The KYC process need to be repeated when investors deal with different Private Equity Firms even on the same Investran platform 
* Customer onboarding module in Investran is very basic. KYC process is done offline and only the results are recorded in Investran solution
* Customers in context are corporate firms for which KYC process takes time to complete
* There is no automated way to capture updated documents and data updates. The process is usually repeated semi-annually/annually to be current 

FIDiD Solution
-------------
**"Re-Imagining Investran KYC process using decentralized proof verification"** 

* Solution to integrate with FIS Investran and provide more efficient Investor onboarding to Private Equity Fund management process
* Reuse of KYC verification across participating fund managers, eliminating redundant verification process for each contact
* Effective use of blockchain to bring in decentralized trust among participants 
* Customers to own, manage and share data, reducing risks in data misuse
* Efficient way to publish data changes and trigger re-verification, initiated from the Customer end to all associated fund managers
* Opportunity for cross monetization of KYC verification process results, managed through smart contracts   

Opportunity for FIS
-------------
* FIS holds the major market share in the Private Equity Tech space with Investran product. This brings in better reach and acceptance to have an enhanced KYC module with integration to Investran
*  FIS with its credibility and expertise will be the preferred solution provider to define a consortium, build and manage the business network for this solution
* FIS with a wide range of products and customer base could leverage this solution across other business lines in future


Solution Outline
-------------

FIDiD solution is to extend Investran features to enable a more efficient KYC, customer onboarding and customer data management process. Key Components are 

 * **FIDiD-Data Wallet** - Mobile app & web application provided for Investors. Can be licensed to deploy on premise, or hosted in FIS Cloud. Application is used to store and maintain data needed for KYC verification. Data includes Customer details, contact information, copy of documents needed for verification and other associated details/documents needed for Invester onboarding and servicing. 
	* Individuals and institutions store information in systems they own/control - Phone, Laptops, Servers etc. 
	* Store and maintain data needed for KYC verification. Data includes
		* General Customer details filled in like a form - Individual fields that can be separately verified
		* Scanned copy of documents self signed
		* Copy of documents digitally signed by issuers 
		* Digital proofs from Institutions providing SSI data
		* Some information can be self verified and signed. Some of them are verified by other participating entities in the consortium
	* Option to view data shared with other entities, manage data access to entities
	* Give consent/ share data with new participating PE Firms including proof of verification

 * **FIDiD-Data Manager** - FIDiD Plugin to Investran solution with Investor onboarding features. 
* Accept requests from investors for Fund application
* Digitally share list of information/documents required to complete the onboarding process. Use of standard templates will aid in automated data mapping and verification
* Create and share verification proofs and maintain verification proof status in FIDiD blockchain


 * **FIDiD-Verification Proof Status Register** - Block chain module to store verification proof status. Verification proof status to include an encrypted message hash, verification status and verification expiry date. Status register gives control for the verifier to cancel/revoke a verification and to manage verification expiry

 * **FIDiD-KeyMgr** - Blockchain module/ registry for public entities. This immutable registry stores information of all participating Private Equity firms including their public keys and general information. 

 
Reference Use Case
-------------
Private Equity firms define new funds and request investments.
 
Blackstone Group and Bern Capital are two Private Equity firms having portfolio of funds.

Mehta Group is investing in Blackstone Group fund - Global Energy & Power Infrastructure Fund III. Mehta group contacts Blackstone Group fund and starts the application process. Application form is submitted and set of document proofs are requested. 

Mehta group submit the required documents. Blackstone group does verification of the documents, requests additional documents and complete KYC process. Mehta Group is onboarded to invest in Blackstone Group fund.
 
Mehta Group would like to invest in a Bern Capital fund. Same process to be repeated here including the documents required and verification process. Mehta group contacts Bern Capital and starts the application process; application form is submitted and same/similar set of document proofs are requested. Bern Capital does a similar verification process on the same set of data. 
 
FIDiD solution in Investran can improve the above process. With FIDiD solution, KYC verification done with Blackstone Group can be reused in Bern Capital, speeding up customer onboarding. This is possible only because of the technology that FIDiD solution uses, a Blockchain based trust framework providing a trusted way for Private Equity firms to share verification proofs between each other. 

We strongly believe Customer should be owning his data, and all the data sharing/ data access is controlled by the Customer directly. 
 

How it works
------------- 
FIDiD product is integrated with Investran solution. Customers (Investors) are encouraged to install and maintain FIDiD Data Wallet product since it speeds up future onboarding processes and helps publish any updates. 

Mehta group installs FIDiD Data Wallet and update/upload corporate data and other relevant information and documents in the Manage Data section.
 
All Private Equity firms (Blackstone and Bern Capital) part of the consortium will have their details including the public key details and end point URL in the blockchain key store area.  
   
**Part - 1: Fund request and investor onboarding**
 
Mehta Group wants to invest in a Blackstone Group Fund. Mehta Group user raises an application request using the Application Request section of FIDiD application. Search for the PE Fund using the PE identifier or PE name. Submit the application using some basic data fields from Data profile. Internally FIDiD was able to search for the PE in blockchain key store area and submit application using the end point URL stored. 
 
Blackstone Group received the application request from Mehta Group in the Investran application, FIDiD Data Manager section. Blackstone review the application and identify the additional data needed from Mehta group for KYC. With the established connection, request is sent to Mehta Group's FIDiD Data Wallet application.
 
Communication is standardized using templates. Commonly used data/fields are pre-defined to be used. This provides an efficient way to request/ re-use proofs between entities. 
 
Request message that Blackstone gave to Mehta Group contains a set of data items needed to complete the KYC. To the extent possible, the fields from standardized templates are used. eg. First Name, Last Name, DOB, Company Name, Date of Incorporation, Incorporation Letter etc.
 
Mehta Group's FIDiD Data Wallet application received request from Blackstone for the set of data items needed. For the fields from standard template that were requested, FIDiD application will be able to map to the data already filled in. The new application will appear in Manage Application section as In-Progress status.
 
Mehta Group logs in, completes the application form and submit to Blackstone for verification. Since this is the first time an application is submitted, response will only have the data requested. Fields in the response will be encrypted and signed by Mehta Group. 
 
Once response is received at Blackstone group, details are verified and accepted. Verification can be manual or automated based on the data sources available. Once Verification is complete against the data fields, a verification proof is generated by Blackstone group and shared with Mehta Group. In addition, an encrypted hash is saved in Blockchain under FIDiD-Verification Proof Status with verification status and expiry date. Application is accepted if all data fields are verified and KYC is complete. 

Since the verification proof status is saved in Blockchain, Mehta Group's FIDiD application can fetch status of all verification proofs directly and display in the application. Verification proofs will be shown next to the data fields in Manage Data Section as well.
 
KYC is complete for Mehta Group and the firm is onboarded to Blackstone's Investran platform for investment in the funds. 
 
**Part - 2: Re-using KYC verification across Private Equity firms**
 
Mehta Group would like to invest in a fund from Bern Capital. Bern Capital is also part of the same consortium and using Investran.
 
Mehta Group user raises an application request using the Application Request section of FIDiD application. First part of the process remain the same as in Blackstone Group scenario. Bern Capital requests set of data needed to complete KYC.

Mehta Group's FIDiD application received request from Bern Capital for the set of data items needed. For the fields from standard template that were requested, FIDiD application will be able to map to the data already filled in. The new application will appear in Manage Application section as In Progress status.
 
Mehta Group logs in and completes the application form. Since few of the data fields were already verified by Blackstone Group, Mehta Group can select the verification proofs also to be included in the response to Bern Capital. This forms the consent from Mehta group to use data for KYC along with details of prior verification done by Blackstone Group. 
 
Verification proof will have a combination of data verified, proof that the data is not tampered along with reference to the supporting documents used for verification. Supporting documents will be prompted by FIDiD application to Mehta Group user to be sent when the verification proof is selected. 
 
Bern Capital will receive the data along with details on Verification proofs for selected fields. Bern Capital can independently verify the verification proofs shared with Blockchain keystore and confirm the data is not tampered. For fields where verification proof was not shared, Bern Capital will need to do the verification and result of verification will be shared with Mehta Group and status is uploaded to Blockchain.
 
Application is accepted if all data fields are verified and KYC is complete. 
 
Mehta Group's FIDiD application will fetch status of all verification proofs directly and display in the application. Verification proofs will show verification icon from Bern Capital in addition to the proofs from Blackstone Group.
 
 **Part - 3: Publishing data changes to relevant Private Equity firms**
 
Investors can have scenarios where changes to data is needed. It can either be a change to details, revision to a document/agreement, or a periodic update to a document. Such changes need to be informed to the Private Equity firms with whom the data was shared before.
 
FIDiD solution allows investors to update data in a single place and send notification to all data consumers informing the data update. With FIDiD solution, it is easy to identify the data consumers even for a field level/ document level change.  
 
Mehta Group can log in to FIDiD solution and update the beneficiary details. The investor adds additional document proofs to support the change. Since the data was shared with multiple Private Equity firms, Mehta Group user can select the PE firms and trigger an update. Verification will happen same as in Part 1 and Part 2 and verification proofs will be uploaded to Block chain. 
 
Technologies Used
-------------
- Hyperledger Fabric framework
- Hyperledger Composer
- UI Framework - Angular/ Bootstrap


Glossary
------------- 
**Investran - Private Equity portfolio and investor accounting**
 
Investran is an integrated private equity software suite that automates front-, middle- and back-office processes for private equity firms, including general partners, limited partners, service providers, fund of funds and family offices. Covering the entire investment life cycle, Investran offers accounting, relationship management and partnership accounting functionality. 
 
**General Partner (GP) and Limited Partner (LP)**
 
A private equity firm is called a general partner (GP) and its investors that commit capital are called limited partners (LPs). Limited partners generally consist of pension funds, institutional accounts and wealthy individuals.
 
Limited Partners (LP) are the ones who have arranged and invested the capital for venture capital fund but are not really concerned about the daily maintenance of a venture capital fund whereas General Partners (GP) are investment professionals who are vested with the responsibility of making decisions with respect to the ventures that are required to be invested.
 
 
