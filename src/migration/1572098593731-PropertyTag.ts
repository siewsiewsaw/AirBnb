import {MigrationInterface, QueryRunner} from "typeorm";

export class PropertyTag1572098593731 implements MigrationInterface {

    public async up(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`CREATE TABLE "payments" ("id" int NOT NULL IDENTITY(1,1), "status" nvarchar(255) NOT NULL, "amount" int NOT NULL, "booking_id" int NOT NULL, CONSTRAINT "PK_197ab7af18c93fbb0c9b28b4a59" PRIMARY KEY ("id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "property_tags" ("tags_id" int NOT NULL, "property_id" int NOT NULL, CONSTRAINT "PK_2a7e9ff728f84f97caa0c8f69be" PRIMARY KEY ("tags_id", "property_id"))`, undefined);
        await queryRunner.query(`CREATE INDEX "IDX_a43ad485ecc2a17ab3223174bd" ON "property_tags" ("tags_id") `, undefined);
        await queryRunner.query(`CREATE INDEX "IDX_4fa9ab6a3dde65dba931098708" ON "property_tags" ("property_id") `, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "name"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "email"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "contact_no"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "label" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "name" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "email" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "contact_no" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "payments" ADD CONSTRAINT "FK_e86edf76dc2424f123b9023a2b2" FOREIGN KEY ("booking_id") REFERENCES "booking"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "property_tags" ADD CONSTRAINT "FK_a43ad485ecc2a17ab3223174bd5" FOREIGN KEY ("tags_id") REFERENCES "user"("id") ON DELETE CASCADE ON UPDATE NO ACTION`, undefined);
        await queryRunner.query(`ALTER TABLE "property_tags" ADD CONSTRAINT "FK_4fa9ab6a3dde65dba9310987082" FOREIGN KEY ("property_id") REFERENCES "property"("id") ON DELETE CASCADE ON UPDATE NO ACTION`, undefined);
    }

    public async down(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`ALTER TABLE "property_tags" DROP CONSTRAINT "FK_4fa9ab6a3dde65dba9310987082"`, undefined);
        await queryRunner.query(`ALTER TABLE "property_tags" DROP CONSTRAINT "FK_a43ad485ecc2a17ab3223174bd5"`, undefined);
        await queryRunner.query(`ALTER TABLE "payments" DROP CONSTRAINT "FK_e86edf76dc2424f123b9023a2b2"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "updated_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "created_at"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "contact_no"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "email"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "name"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" DROP COLUMN "label"`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "updated_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "created_at" datetime NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "contact_no" int NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "email" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`ALTER TABLE "user" ADD "name" nvarchar(255) NOT NULL`, undefined);
        await queryRunner.query(`DROP INDEX "IDX_4fa9ab6a3dde65dba931098708" ON "property_tags"`, undefined);
        await queryRunner.query(`DROP INDEX "IDX_a43ad485ecc2a17ab3223174bd" ON "property_tags"`, undefined);
        await queryRunner.query(`DROP TABLE "property_tags"`, undefined);
        await queryRunner.query(`DROP TABLE "payments"`, undefined);
    }

}
