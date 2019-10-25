import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Booking {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    property_id: string;

    @Column()
    price: number;

    @Column()
    booking_date: Date;

    @Column()
    user_id: number;

    @Column()
    check_in: Date;

    @Column()
    check_out: Date;

    @Column()
    created_at: Date;

    @Column()
    updated_at: Date;
   }   
