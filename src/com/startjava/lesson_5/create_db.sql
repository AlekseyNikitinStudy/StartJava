DROP DATABASE IF EXISTS jaegers;
CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE jaegers (
id INTEGER NOT NULL,
modelName VARCHAR(100),
mark VARCHAR(100),
height REAL,
weight REAL,
status VARCHAR(100),
origin VARCHAR(100),
launch TIMESTAMP,
kaijuKill INTEGER);
