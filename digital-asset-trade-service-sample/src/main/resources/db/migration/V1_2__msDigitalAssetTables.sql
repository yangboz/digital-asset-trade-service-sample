ALTER TABLE buy_order ADD daid       BIGSERIAL      NOT NULL;

ALTER TABLE sell_order ADD daid       BIGSERIAL      NOT NULL;

ALTER TABLE execution ADD  daid       BIGSERIAL      NOT NULL;

CREATE TABLE ms_digital_asset (
  id       BIGSERIAL      NOT NULL PRIMARY KEY,
  metadata VARCHAR(256)         NOT NULL,
  type   BIGINT         NOT NULL,
  value    NUMERIC(256, 1) NOT NULL,
  created  TIMESTAMPTZ    NOT NULL,
  version  BIGINT
);