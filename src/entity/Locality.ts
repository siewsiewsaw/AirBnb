import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Locality {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    Area: String;

    @Column()
    States: String;
  
   }   
