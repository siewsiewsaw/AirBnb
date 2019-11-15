import {Entity, PrimaryGeneratedColumn, Column, CreateDateColumn} from "typeorm";

@Entity()
export class Booking {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    property_id: string;

    @Column()
    price: number;

    @CreateDateColumn({name: "booking_date"})
    bookingAt;

    @Column()
    user_id: number;

    @CreateDateColumn({name: "check_in"})
    checkInAt;

    @CreateDateColumn({name: "check_out"})
    checkOutAt;   

    @CreateDateColumn({name: "created_date"})
    createdAt;
    
    @CreateDateColumn({name: "updated_date"})
    updatedAt;
   }   
