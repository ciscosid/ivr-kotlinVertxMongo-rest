package com.godric.inc.ivrREST.router

import com.godric.inc.ivrREST.controllers.Requests
import io.vertx.core.Vertx
import io.vertx.ext.web.Router

class RequestRoutes(vertx: Vertx) {
    var router: Router = Router.router(vertx)

    init {
        router.get("/").handler { routingContext ->
            Requests.index(routingContext)
        }
        router.get("/get-one").handler { routingContext ->
            Requests.getOneUser(routingContext, "users")
        }
    }
}
