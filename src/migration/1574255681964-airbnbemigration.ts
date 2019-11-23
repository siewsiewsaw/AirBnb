import {MigrationInterface, QueryRunner} from "typeorm";

export class airbnbemigration1574255681964 implements MigrationInterface {

    public async up(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`CREATE TABLE "payment" ("id" int NOT NULL IDENTITY(1,1), "status" nvarchar(255) NOT NULL, "amount" int NOT NULL, "created_at" datetime2 NOT NULL CONSTRAINT "DF_2216ad74f64b73c04d5fb3c3610" DEFAULT getdate(), "updated_at" datetime2 NOT NULL CONSTRAINT "DF_6765c894a5ccf625b7b0a4ac9e3" DEFAULT getdate(), "booking_id" int, CONSTRAINT "PK_fcaec7df5adf9cac408c686b2ab" PRIMARY KEY ("id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "tags" ("id" int NOT NULL IDENTITY(1,1), "label" nvarchar(255) NOT NULL, CONSTRAINT "PK_e7dc17249a1148a1970748eda99" PRIMARY KEY ("id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "property_tags" ("tags_id" int NOT NULL, "property_id" int NOT NULL, CONSTRAINT "PK_2a7e9ff728f84f97caa0c8f69be" PRIMARY KEY ("tags_id", "property_id"))`, undefined);
        await queryRunner.query(`CREATE INDEX "IDX_a43ad485ecc2a17ab3223174bd" ON "property_tags" ("tags_id") `, undefined);
        await queryRunner.query(`CREATE INDEX "IDX_4fa9ab6a3dde65dba931098708" ON "property_tags" ("property_id") `, undefined);
        await queryRunner.query(`ALTER TABLE "owner" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "label"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "comments" DROP COLUMN "review_id"`, undefined);
        await queryRunner.query(`ALTER TABLE "locality" DROP COLUMN "propertyID"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP COLUMN "userID"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP COLUMN "propertyID"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" ADD "created_date" datetime2 NOT NULL CONSTRAINT "DF_60ea6de92aaf02fb7f6a726b440" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" ADD "updated_date" datetime2 NOT NULL CONSTRAINT "DF_2c945ebb4f36f1592a35f5764fe" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "created_date" datetime2 NOT NULL CONSTRAINT "DF_f786c62dd119f2d20081b32ef1c" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "updated_date" datetime2 NOT NULL CONSTRAINT "DF_28b48ab976227561b192fda3404" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" ADD "created_date" datetime2 NOT NULL CONSTRAINT "DF_a654986af97fe4c10306657f50a" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" ADD "updated_date" datetime2 NOT NULL CONSTRAINT "DF_ab858acd916034a59e5241f3b8a" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD "created_at" datetime2 NOT NULL CONSTRAINT "DF_81198b0b6b914eeead02c2214d2" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD "updated_at" datetime2 NOT NULL CONSTRAINT "DF_e02237374f140f496afbc987263" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP COLUMN "owner_id"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD "owner_id" int`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "booking_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "booking_date" date NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "created_at" datetime2 NOT NULL CONSTRAINT "DF_5f3da1d174503855f57421f692d" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "updated_at" datetime2 NOT NULL CONSTRAINT "DF_e3cc0c008e9a70922a8f04a3641" DEFAULT getdate()`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ALTER COLUMN "user_id" int`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "property_id"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "property_id" int`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD CONSTRAINT "FK_2541d2fb798d385a0521553370d" FOREIGN KEY ("owner_id") REFERENCES "owner"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD CONSTRAINT "FK_276896d1a1a30be6de9d7d43f53" FOREIGN KEY ("user_id") REFERENCES "user"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD CONSTRAINT "FK_5597161ba02971a62c629fc5a44" FOREIGN KEY ("property_id") REFERENCES "property"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "payment" ADD CONSTRAINT "FK_cee78453638dfaf440f1aa63c26" FOREIGN KEY ("booking_id") REFERENCES "booking"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "property_tags" ADD CONSTRAINT "FK_a43ad485ecc2a17ab3223174bd5" FOREIGN KEY ("tags_id") REFERENCES "tags"("id") ON DELETE CASCADE ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "property_tags" ADD CONSTRAINT "FK_4fa9ab6a3dde65dba9310987082" FOREIGN KEY ("property_id") REFERENCES "property"("id") ON DELETE CASCADE ON UPDATE NO ACTION`, undefined);
    }

    public async down(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`ALTER TABLE "property_tags" DROP CONSTRAINT "FK_4fa9ab6a3dde65dba9310987082"`, undefined);
        await queryRunner.query(`ALTER TABLE "property_tags" DROP CONSTRAINT "FK_a43ad485ecc2a17ab3223174bd5"`, undefined);
        await queryRunner.query(`ALTER TABLE "payment" DROP CONSTRAINT "FK_cee78453638dfaf440f1aa63c26"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP CONSTRAINT "FK_5597161ba02971a62c629fc5a44"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP CONSTRAINT "FK_276896d1a1a30be6de9d7d43f53"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP CONSTRAINT "FK_2541d2fb798d385a0521553370d"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "property_id"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "property_id" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ALTER COLUMN "user_id" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP CONSTRAINT "DF_e3cc0c008e9a70922a8f04a3641"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP CONSTRAINT "DF_5f3da1d174503855f57421f692d"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" DROP COLUMN "booking_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "booking" ADD "booking_date" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP COLUMN "owner_id"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD "owner_id" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP CONSTRAINT "DF_e02237374f140f496afbc987263"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP CONSTRAINT "DF_81198b0b6b914eeead02c2214d2"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "property" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP CONSTRAINT "DF_ab858acd916034a59e5241f3b8a"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP COLUMN "updated_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP CONSTRAINT "DF_a654986af97fe4c10306657f50a"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" DROP COLUMN "created_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP CONSTRAINT "DF_28b48ab976227561b192fda3404"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "updated_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP CONSTRAINT "DF_f786c62dd119f2d20081b32ef1c"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "created_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" DROP CONSTRAINT "DF_2c945ebb4f36f1592a35f5764fe"`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" DROP COLUMN "updated_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" DROP CONSTRAINT "DF_60ea6de92aaf02fb7f6a726b440"`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" DROP COLUMN "created_date"`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" ADD "propertyID" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "reviews" ADD "userID" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "locality" ADD "propertyID" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "comments" ADD "review_id" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "label" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "owner" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`DROP INDEX "IDX_4fa9ab6a3dde65dba931098708" ON "property_tags"`, undefined);
        await queryRunner.query(`DROP INDEX "IDX_a43ad485ecc2a17ab3223174bd" ON "property_tags"`, undefined);
        await queryRunner.query(`DROP TABLE "property_tags"`, undefined);
        await queryRunner.query(`DROP TABLE "tags"`, undefined);
        await queryRunner.query(`DROP TABLE "payment"`, undefined);
    }

}
