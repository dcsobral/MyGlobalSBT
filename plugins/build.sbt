addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

addSbtPlugin("me.lessis" % "np" % "0.2.0")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

resolvers += "ls-sbt-resolver-0" at "http://repo.lessis.me"

resolvers += "ls-sbt-resolver-1" at "http://repo.codahale.com"

// resolvers += Resolver.url("scalasbt", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4")

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.0.10")

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")
