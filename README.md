Verifier Server
==

Welcome to the Verifier Server Repository. <br>
This repository contains the source code, documentation, and related resources for the Verifier Server.

## Folder Structure
Overview of the major folders and documents in the project directory:

```
did-verifier-server
├── CHANGELOG.md
├── CLA.md
├── CODE_OF_CONDUCT.md
├── CONTRIBUTING.md
├── LICENSE
├── dependencies-license.md
├── MAINTAINERS.md
├── README.md
├── README_ko.md
├── RELEASE-PROCESS.md
├── SECURITY.md
├── docs
│   └── api
│       └── Verifier_API_ko.md
│   └── errorCode
│       └── Verifier_ErrorCode.md
│   └── db
│       └── OpenDID_TableDefinition_Verifier.md
│   └── installation
│       └── OpenDID_VerifierServer_InstallationAndOperation_Guide.md
│       └── OpenDID_VerifierServer_InstallationAndOperation_Guide_ko.md
└── source
    └── verifier
        ├── gradle
        ├── libs
            └── did-sdk-common-1.0.0.jar
            └── did-blockchain-sdk-server-1.0.0.jar
            └── did-core-sdk-server-1.0.0..jar
            └── did-crypto-sdk-server-1.0.0.jar
            └── did-datamodel-server-1.0.0.jar
            └── did-wallet-sdk-server-1.0.0.jar
        ├── sample
        └── src
        └── build.gradle
        └── README.md
```

<br/>

Below is a description of each folder and file in the directory:

| Name                    | Description                                     |
| ----------------------- | ----------------------------------------------- |
| CHANGELOG.md            | Version-specific changes in the project         |
| CODE_OF_CONDUCT.md      | Code of conduct for contributors                |
| CONTRIBUTING.md         | Contribution guidelines and procedures          |
| LICENSE                 | Licenses                                        |
| dependencies-license.md | Licenses for the project’s dependency libraries |
| MAINTAINERS.md          | Guidelines for project maintainers              |
| RELEASE-PROCESS.md      | Procedures for releasing new versions           |
| SECURITY.md             | Security policies and vulnerability reporting   |
| docs                    | Documentation                                   |
| ┖ api                   | API guide documentation                         |
| ┖ db                    | Database ERD,  Table Specifications             |
| ┖ errorCode             | Error codes and troubleshooting guides          |
| ┖ installation          | Installation and setup instructions             |
| source                  | Server source code project                      |
| ┖ verifier              | Verifier Server source code and build files     |
| &nbsp;&nbsp;&nbsp;┖ gradle  | Gradle build configurations and scripts     |
| &nbsp;&nbsp;&nbsp;┖ libs    | External libraries and dependencies         |
| &nbsp;&nbsp;&nbsp;┖ sample  | Sample files                                |
| &nbsp;&nbsp;&nbsp;┖ src     | Main source code directory                  |
| &nbsp;&nbsp;&nbsp;┖ build.gradle | Gradle build configuration file        |
| &nbsp;&nbsp;&nbsp;┖ README.md | Overview and instructions for the source code|

<br/>


## Libraries

Libraries used in this project are organized into two main categories:

1. **Open DID Libraries**: These libraries are developed by the Open DID project and are available in the [libs folder](source/did-verifier-server/libs). They include:

   - `did-sdk-common-1.0.0.jar`
   - `did-blockchain-sdk-server-1.0.0.jar`
   - `did-core-sdk-server-1.0.0.jar`
   - `did-crypto-sdk-server-1.0.0.jar`
   - `did-data-model-server-1.0.0.jar`
   - `did-wallet-sdk-server-1.0.0.jar`

2. **Third-Party Libraries**: These libraries are open-source dependencies managed via the [build.gradle](source/did-verifier-server/build.gradle) file. For a detailed list of third-party libraries and their licenses, please refer to the [dependencies-license.md](dependencies-license.md) file.

## Installation And Operation Guide

For detailed instructions on installing and configuring the Issuer Server, please refer to the guide below:
- [OpenDID VerifierServer Installation and Operation Guide](docs/installation/OpenDID_VerifierServer_InstallationAndOperation_Guide.md)  

## API Reference

- **Verifier API**: Detailed reference for the Verifier Server's API endpoints and usage.
  - [Verifier API Reference](docs/api/Verifier_API_ko.md)

## Change Log

The Change Log provides a detailed record of version-specific changes and updates. You can find it here:
- [Change Log](./CHANGELOG.md)  

## OpenDID Demonstration Videos <br>
To watch our demonstration videos of the OpenDID system in action, please visit our [Demo Repository](https://github.com/OmniOneID/did-demo-server). <br>

These videos showcase key features including user registration, VC issuance, and VP submission processes.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) and [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for details on our code of conduct, and the process for submitting pull requests to us.

## License
[Apache 2.0](LICENSE)