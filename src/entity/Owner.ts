import {Entity, PrimaryGeneratedColumn, Column, CreateDateColumn} from "typeorm";

@Entity()
export class Owner {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    name: string;

    @Column()
    email: string;

    @Column()
    contact_no: number;
    
    @CreateDateColumn({name: "created_date"})
    createdAt;
    
    @CreateDateColumn({name: "updated_date"})
    updatedAt;
   }   
