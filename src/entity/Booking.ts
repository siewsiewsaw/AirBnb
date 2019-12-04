import { Entity, PrimaryGeneratedColumn, Column, CreateDateColumn, UpdateDateColumn, ManyToOne, JoinColumn } from "typeorm";
import { Property } from "./Property";
import { Users } from "./Users";

@Entity()
export class Booking {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    price: number;

    @Column("date", { name: "booking_date" })
    bookingDate;

    @Column("datetime", { name: "check_in" })
    checkIn;

    @Column("datetime", { name: "check_out" })
    checkOut;

    @ManyToOne(type => Users)
    @JoinColumn({ name: 'user_id' })
    users: Users

    @ManyToOne(type => Property)
    @JoinColumn({ name: 'property_id' })
    property: Property

    @CreateDateColumn({ name: "created_at" })
    createdAt;

    @UpdateDateColumn({ name: "updated_at" })
    updatedAt;
} 
