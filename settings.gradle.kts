rootProject.name = "modules"
include("api")
include("domain")
include("infra:client")
project(":infra:client").projectDir = file("infra/client")
include("infra:data")
project(":infra:data").projectDir = file("infra/data")

//include("api")
//project(":api").projectDir = file("src/main/kotlin/api")
//
//include("domain")
//project(":domain").projectDir = file("src/main/kotlin/domain")
//
//include("infra.client")
//
//include("infra.data")
//project(":infra.data").projectDir = file("src/main/kotlin/infra/data")