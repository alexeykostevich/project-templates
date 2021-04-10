# Build the app.
FROM node:14 as builder

USER node
RUN mkdir -p /home/node/app
WORKDIR /home/node/app

COPY --chown=node:node package*.json ./
COPY --chown=node:node ./src ./src
COPY --chown=node:node tsconfig.json ./

RUN npm ci

# Run the app.
FROM node:14-alpine as app

USER node
RUN mkdir -p /home/node/app
WORKDIR /home/node/app

COPY --chown=node:node --from=builder /home/node/app ./

CMD [ "npx", "ts-node", "src/index.ts" ]
