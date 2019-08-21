package com.godric.inc.ivrREST.configs

import io.vertx.core.json.JsonObject

object Config {
        private var config: JsonObject = JsonObject().put(
        "connection_string",
        "localhost:27017"
    )

    fun getConfig(): JsonObject {
        return config
    }
}


//fun main() {
////    Config.config = JsonObject().put("na", "na")
//    println(Config.getConfig())
//}
