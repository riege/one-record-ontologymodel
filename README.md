# one-record-ontologymodel

## Introduction

This repository contains **Java POJO classes for IATA ONE Record** (1R), as per
official IATA Ontology on GitHub at https://github.com/IATA-Cargo/ONE-Record.

Note that the deliverable of this project contains POJO classes from the 
Ontologies for "API-Security" _and_ "Data-Model". 

This repository additionally contains some assisting classes e.g., 
in package `org.iata.cargo.codelists` which are not generated from the 
Ontology but might be useful for fields where values are limited to code
lists. Please note the `codelists` packages are incomplete and do not
mirror all cods from the Ontology. 
See also [IATA-Cargo/ONE-Record Issue#92](https://github.com/IATA-Cargo/ONE-Record/issues/92) for details about
"Standard values of enumerations".

## How to use / Dependencies

This repository aims use the most minimal dependencies, therefore also `build.gradle` 
comes with disabled transitive dependency resolution. The declared project 
dependencies resolve the POJO annocations.

See these examples about the POJOs used in projects: 

* https://github.com/riege/one-record-converter (using this library)
* https://github.com/IATA-Cargo/one-record-server-java (original from IATA)

## Used Ontology / Data model version

In general, the official IATA Ontology determines the 1R data model.  The IATA Ontology is available in various versions at GitHub.
The IATA [Cargo Operations and Technology Board, COTB](https://www.iata.org/en/programs/workgroups/cotb)
approved various Ontology versions. 

Ontologies prior [version 1.1](https://github.com/IATA-Cargo/ONE-Record/tree/master/June-2021-standard-COTB-endorsed)
have not been covered enought data fields required used by forwarders in the CargoIMP/XMP (X)FWB.

This project aims to keeps it's releases and versioning in synchronization with the IATA Ontologies, starting with IATA ONE Record Ontology version 1.1.

Update 2021-OCT: On Oct-22th IATA [fixed a bug in Ontology 1.1](https://github.com/IATA-Cargo/ONE-Record/tree/master/June-2021-standard-COTB-endorsed),
this fix is mirrored in release 1.1.1 of this library.

## Question and Feedback

For any issues or questions with the ONE Record Ontology and data model as such,
please refer to or create new issues with the IATA-Cargo project on GitHub under
https://github.com/IATA-Cargo/ONE-Record/issues.

## Generation from a new Ontology

Generation of Java domain classes from the Ontology is part of the IATA Sandbox implementation, see https://github.com/IATA-Cargo/one-record-server-java/blob/master/README.md.

Updating file `iata.ttl` in this project and applying step "Generate ONE Record cargo related data model" from the README generates the POJOs.

It is recommended to remove directory `src/main/generated-sources/org/iata/cargo` prior generation.

Example for generation from IATA-Cargo/one-record-server-java main directory on Linux/macOS with Ontology 1.1 (June 2021):

    rm -rf src/main/generated-sources/org/iata/cargo
    curl -o iata.ttl https://raw.githubusercontent.com/IATA-Cargo/ONE-Record/master/June-2021-standard-COTB-endorsed/Data-Model/IATA-1R-DM-Ontology-vCOTB-Jun2021.ttl
    mvn package -Dbuild=cargo

Compile might fail now but ```src/main/generated-sources/org/iata/cargo``` contains the freshly generated POJO files which required adoption of annotations 
prior updating this the one-record-ontologymodel project with them.

P.S.: As per 2021-Mar-18, the Ontology has various open issues which are likely to be adopted in upcoming versions e.g., https://github.com/IATA-Cargo/ONE-Record/issues/85 or https://github.com/IATA-Cargo/ONE-Record/issues/111
