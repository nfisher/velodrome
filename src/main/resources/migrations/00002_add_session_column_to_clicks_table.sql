--liquibase formatted sql

--changeset nfisher:2
ALTER TABLE clicks
  ADD COLUMN
    session VARCHAR(255);     -- the session or user ID
--rollback ALTER TABLE clicks DROP session;