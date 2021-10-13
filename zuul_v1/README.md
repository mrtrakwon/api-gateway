## Api Gateway Based On Zuul Version1

### Prerequirement
- java11
- docker(optional)

### features
- this project was made for api gateway supporting authentication.
- this api gateway project based on zuul v1
- the features of zuul_v1 
  - using tomcat v9 for servlet, so not support nonblocking.
  - zuul_v1 run based on filters.
  - there are several types of filter.
    - pre filter : execute before routing to origin.
    - route filter : handle routing the request to origin.
    - post filter : execute after the request has been routed to the origin.
    - error : execute when an error occurs during on of the other phase


# Refference
- https://netflixtechblog.com/announcing-zuul-edge-service-in-the-cloud-ab3af5be08ee
- https://techblog.woowahan.com/2523/