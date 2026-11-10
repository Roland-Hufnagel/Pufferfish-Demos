CREATE TABLE  IF NOT EXISTS users
(
    id   BIGINT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);
CREATE TABLE IF NOT EXISTS orders
(
    id      BIGINT PRIMARY KEY,
    price   DECIMAL(10, 2),
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_orders_user FOREIGN KEY (user_id) REFERENCES users (id)
);