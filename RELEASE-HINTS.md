# Developer internal info for release strategy

This library project started with the "latest" working draft which was developed out of Ontology version 1.0.
Therefore first release got tagged as `v1.0-workingdraft2021mar`.

Further releases should follow the IATA versioning pattern of IATA approved ONE Record Ontogogies, e.g. `v1.1`.

Prior a new release the project should be checked to generate javadoc without errors via 

    ./gradlew javadoc

Reason is that the Ontology might contain characters which are invalid in Javadoc, e.g. the &amp; character.

A new release requires to be branched and tagged with `v<VERSIONNUMBER>`.
