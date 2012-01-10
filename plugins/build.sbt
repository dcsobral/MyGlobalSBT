addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.5.0")

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "0.11.0")

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("me.lessis" % "np" % "0.2.0")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.1")

resolvers += "lessis" at "http://repo.lessis.me"

resolvers += "coda" at "http://repo.codahale.com"

resolvers += Resolver.url("scalasbt", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4")

