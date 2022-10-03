import { Entity } from "typeorm";
import { Column } from "typeorm/decorator/columns/Column";
import { PrimaryGeneratedColumn } from "typeorm/decorator/columns/PrimaryGeneratedColumn";

@Entity ('hotel')

export class Hotel{

    @PrimaryGeneratedColumn('uuid')
    id:string;
    @Column({type:String})
    name:string;
    @Column({type:String})
    location:string;
    @Column({type:String})
    room:string;
    @Column({type:String})
    paymenMethod:string;

}