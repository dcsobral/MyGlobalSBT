addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("me.lessis" % "np" % "0.2.0")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.1")

resolvers += "ls-sbt-resolver-0" at "http://repo.lessis.me"

resolvers += "ls-sbt-resolver-1" at "http://repo.codahale.com"

resolvers += Resolver.url("scalasbt", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4")

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.0.7")

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

