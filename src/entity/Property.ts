import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Property {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    address: string;

    @Column()
    owner_id: string;

    @Column()
    created_at: Date;

    @Column()
    updated_at: Date;
}   
