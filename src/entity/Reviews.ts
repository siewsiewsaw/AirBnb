import {Entity, PrimaryGeneratedColumn, Column, CreateDateColumn} from "typeorm";

@Entity()
export class Reviews {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    ratings: number;

    @CreateDateColumn({name: "created_date"})
    createdAt;

    
    @CreateDateColumn({name: "updated_date"})
    updatedAt;
}