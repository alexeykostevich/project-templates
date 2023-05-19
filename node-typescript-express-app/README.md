# Node.js TypeScript Express App

An [Express](https://expressjs.com/) web application in TypeScript.

## Technology Stack

|                   | Technology                                      |
| ----------------- | ----------------------------------------------- |
| Language          | [TypeScript 5](https://www.typescriptlang.org/) |
| Testing Framework | [Jest](https://jasmine.github.io/)              |
| Code Formatter    | [Prettier](https://prettier.io/)                |

## Development

### Quickstart

1. Install [Node.js](https://nodejs.org/)
2. Install [Docker](https://docs.docker.com/)

### Quickstart

```sh
# Install the dependencies.
npm ci

# Start the app in the dev mode.
npm start:dev

# Build the app.
npm build

# Start the app.
npm start
```

Also, you can run the app in Docker container:

```sh
# Start the app in a Docker container.
npm docker:start
```

Open http://localhost:8080/api/ping to check that the app is running.

> **TIP**: The project is already set up for debugging in VS Code.
