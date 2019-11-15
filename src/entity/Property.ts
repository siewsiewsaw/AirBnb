import {
    Entity,
    PrimaryGeneratedColumn,
    Column,
    JoinColumn,
    ManyToMany,
    JoinTable,
} from 'typeorm'
import { Tags } from './Tags'


@Entity()
export class Property {

    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    address: string;

    @Column()
    owner_id: string;

    
    @ManyToMany(type => Tags)
    @JoinTable({
        name: 'tags_property',
        joinColumns: [{ name: 'property_id' }],
        inverseJoinColumns: [{ name: 'tag_id' }],
    })
}    