Spring Interceptors

Interceptors - run in between requests; whereas Filters/Serveletfilters run prior to rendering a view - Filter chain also used in Spring Security.

Filters intercept the request that reach the dispatcher servelet (authenticate user prior to reaching your controller) / Interceptor intercepts the requests between the dispatcher servelet and the controller.

Interceptors primarily used for pre and post processing of tasks.

Interceptor has 3 methods
- preHandle: perform actions on request prior to sending it to the controller.
- postHandle: perform actions on the response prior to sending it to the client.
- afterCompletion: perform actions after request / response completed.

Implementation:
- Create an interceptor class and implement interface HandlerInterceptor (HandlerInterceptorAdapter - deprecated)
- HandlerInterceptor: has default implementations for the methods
- Override preHandle(or others as needed)
- Create a configuration class that implements WebMvcConfigurer and register the interceptor
