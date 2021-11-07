FROM node:14 as builder-ts

USER node
RUN mkdir -p /home/node/app
WORKDIR /home/node/app

COPY --chown=node:node package.json ./
COPY --chown=node:node package-lock.json ./
RUN npm ci

COPY --chown=node:node ./tsconfig.json ./tsconfig.json
COPY --chown=node:node ./src ./src
RUN npm run build


FROM node:14 as builder-node-modules

USER node
RUN mkdir -p /home/node/app
WORKDIR /home/node/app

COPY --chown=node:node package.json ./
COPY --chown=node:node package-lock.json ./
RUN npm ci --only=production


FROM node:14-alpine as app

USER node
RUN mkdir -p /home/node/app
WORKDIR /home/node/app

COPY --chown=node:node --from=builder-ts /home/node/app/dist ./dist
COPY --chown=node:node --from=builder-node-modules /home/node/app/node_modules ./node_modules
COPY --chown=node:node --from=builder-node-modules /home/node/app/package.json ./
COPY --chown=node:node --from=builder-node-modules /home/node/app/package-lock.json ./

EXPOSE 8080

ENTRYPOINT [ "node", "index.js" ]
