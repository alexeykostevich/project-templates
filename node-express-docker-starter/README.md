# Node.js Express Docker Starter

A starter for running [Express](https://expressjs.com/) web application with [Docker](https://www.docker.com/).

## Prerequisites

- Install [Node.js](https://nodejs.org/)
- Install [Docker](https://docs.docker.com/)

## Quickstart with Docker

```sh
# Build an image from a Dockerfile with the given tag.
docker build \
  --tag alexeykostevich/node-express-docker-starter \
  .

# Run a container.
docker run \
  --rm \
  --publish 49160:8080 \
  --env-file="./environment/development.env" \
  --memory "300M" \
  --memory-swap "1G" \
  --detach \
  --name node-express-docker-starter \
  alexeykostevich/node-express-docker-starter

# See logs.
docker logs node-express-docker-starter

# See logs.
docker attach node-express-docker-starter

# Stop and remove the container.
docker stop node-express-docker-starter
docker rm node-express-docker-starter
```

Open http://localhost:49160/api/ping to check that the app is running.

## Quickstart with Docker Compose

```sh
# Builds, (re)creates, starts, and attaches to containers for a service.
docker-compose up

# Stops containers and removes containers, networks, volumes, and images.
docker-compose down
```

## Debugging with Docker container

```sh
# Install the dependencies.
npm ci

# Builds, (re)creates, starts, and attaches to containers for a service.
docker-compose --file docker-compose.local.yml up

# Stops containers and removes containers, networks, volumes, and images.
docker-compose --file docker-compose.local.yml down
```

Open http://localhost:49160/api/ping to check that the app is running and attach a debugger to ws://0.0.0.0:9229.

> **TIP**: The project is already set up for debugging in VS Code.

## References

- [Dockerizing a Node.js web app](https://nodejs.org/en/docs/guides/nodejs-docker-webapp/)
