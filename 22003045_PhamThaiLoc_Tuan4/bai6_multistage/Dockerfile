# Stage 1: Build - Sử dụng node:18 làm môi trường build
FROM node:18 AS build-stage
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .

# Stage 2: Run - Sử dụng node:18-alpine để tối ưu dung lượng (nhẹ hơn)
FROM node:18-alpine
WORKDIR /app

# Chỉ copy những file cần thiết từ build-stage sang stage này
COPY --from=build-stage /app /app

EXPOSE 3000
CMD ["node", "index.js"]