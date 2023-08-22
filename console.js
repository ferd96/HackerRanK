console.log("hello")
console.log("hello")
console.log("hello")
version: '3.9'

services:
  redis-stack:
    image: redis/redis-stack-server:latest
    container_name: sbc_ciam_redis
    ports:
      - 6379:6379
    #environment:
      #REDIS_ARGS: "--requirepass jav56xkNbpsmLDeUr9GF"
