localRepository('repository-key') {
    description "Public description"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    packageType "generic" // "maven" | "gradle" | "ivy" | "sbt" | "nuget" | "gems" | "npm" | "conan" |
    // "bower" | "debian" | "pypi" | "docker" | "vagrant" | "gitlfs" | "yum" | "generic"
    debianTrivialLayout false
    checksumPolicyType "client-checksums" // default | "server-generated-checksums"
    handleReleases true // default
    handleSnapshots true // default
    maxUniqueSnapshots  0 // default
    snapshotVersionBehavior "unique" // "non-unique" | "deployer"
    suppressPomConsistencyChecks false // default
    blackedOut false // default
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    calculateYumMetadata false
    yumRootDepth 0
    xrayIndex false
    blockXrayUnscannedArtifacts false
    xrayMinimumBlockedSeverity "" // "Minor" | "Major" | "Critical"
}