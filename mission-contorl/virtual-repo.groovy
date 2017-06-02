virtualRepository(reponame) {
  description ''
  notes ''
  includesPattern '**/*'
  excludesPattern ''
  repoLayoutRef 'maven-2-default'
  repositories ([reponame+'2',reponame+'3'])
  defaultDeploymentRepo ''
  artifactoryRequestsCanRetrieveRemoteArtifacts true
  packageType 'maven'
  pomRepositoryReferencesCleanupPolicy 'discard_active_reference'
  keyPair ''
}