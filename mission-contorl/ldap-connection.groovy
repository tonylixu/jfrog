ldap {
    settings('settings_name') {
        url 'ldap://myserver:myport/DC=sampledomain,DC=com' // mandatory
        userDnPattern 'uid={0},ou=People'
        emailAttribute 'mail'
        enabled true // default value - true
        autoCreateUser true // default value - true
        search {
            filter '(uid={0})'
            base 'OU=dev,DC=sampledomain,DC=com'
            searchSubTree true
            managerDn 'CN=admin,OU=ops,DC=sampledomain,DC=com'
            managerPassword 'password'
        }
    }
}