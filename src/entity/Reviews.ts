import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Reviews {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    userID: number;

    @Column()
    propertyID: number;

    @Column()
    ratings: number;

    @Column()
    created_at: Date;

    @Column()
    updated_at: Date;
}   
