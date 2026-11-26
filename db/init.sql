CREATE ROLE inventory_app LOGIN PASSWORD 'inventory_local';
CREATE DATABASE inventory_db OWNER inventory_app;
REVOKE CONNECT ON DATABASE inventory_db FROM PUBLIC;

\connect inventory_db
SET ROLE inventory_app;
\i /opt/erp/master.sql
