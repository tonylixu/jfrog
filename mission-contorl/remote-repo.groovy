remoteRepository('repository-key') {
  url "http://host:port/some-repo"
  username "remote-repo-user"
  password "pass"
  proxy "proxy1"
  description "Public description"
  notes "Some internal notes"
  includesPattern "**/*" // default
  excludesPattern "" // default
  packageType "generic" // "maven" | "gradle" | "ivy" | "sbt" | "nuget" | "gems" | "npm" | "bower" | "debian" | "pypi" | "docker" | "yum" | "vcs" | "p2" | "generic"
  remoteRepoChecksumPolicyType "generate-if-absent" // default | "fail" | "ignore-and-generate" | "pass-thru"
  handleReleases true // default
  handleSnapshots true // default
  maxUniqueSnapshots  0 // default
  suppressPomConsistencyChecks false // default
  offline false // default
  blackedOut false // default
  storeArtifactsLocally true // default
  socketTimeoutMillis 15000
  localAddress "123.123.123.123"
  retrievalCachePeriodSecs 43200 // default
  failedRetrievalCachePeriodSecs 30 // default
  missedRetrievalCachePeriodSecs 7200 // default
  unusedArtifactsCleanupEnabled false // default
  unusedArtifactsCleanupPeriodHours 0 // default
  fetchJarsEagerly false // default
  fetchSourcesEagerly false // default
  shareConfiguration false // default
  synchronizeProperties false // default
  propertySets // (["ps1", "ps2"])
  allowAnyHostAuth false // default
  enableCookieManagement false // default
  xrayIndex false
  blockXrayUnscannedArtifacts false
  xrayMinimumBlockedSeverity "" // "Minor" | "Major" | "Critical"
}