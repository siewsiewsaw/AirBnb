import {
    Entity,
    PrimaryGeneratedColumn,
    Column,
    JoinColumn,
    ManyToMany,
    JoinTable,
} from 'typeorm'
import { Property } from './Property'

@Entity()
export class User {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    label: string;

    @ManyToMany(type => Property)
    @JoinTable({
        name: 'property_tags',
        joinColumns: [{ name: 'tags_id' }],
        inverseJoinColumns: [{ name: 'property_id' }],
    })
    property: Property[] 
}   
