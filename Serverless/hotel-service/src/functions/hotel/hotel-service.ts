import { Hotel } from "src/entities/hotel.entity";
import { getDatabaseConnection } from "@libs/database-manager";


const create=async(hotel:Hotel):Promise<Hotel>=>{
    const hotelRepository= await ( await getDatabaseConnection()).getRepository(Hotel);
    const newHotel:Hotel=await hotelRepository.save(hotel).catch((e)=>{console.error('Failed to Create Hotel. Please try Again...',e);
    throw new Error(e);
    });
    return newHotel;
    }
    const fetch=async(hotelId:string):Promise<Hotel>=>{
    const hotelRepository= await ( await getDatabaseConnection()).getRepository(Hotel);
    const newHotel:Hotel=await hotelRepository.findOneBy({id:hotelId}).catch((e)=>{console.error('Failed to Find Hotel. Please Enter Valid Student ID...',e);
    throw new Error(e);
    });
    return newHotel;
    }
    const fetchAll=async():Promise<Hotel[]>=>{
    const hotelRepository= await ( await getDatabaseConnection()).getRepository(Hotel);
    const hotels:Hotel[]=await hotelRepository.find().catch((e)=>{console.error('Failed to Find Hotels. Database is Empty...',e);
    throw new Error(e);
    });
    return hotels;
    }
    export{create,fetch,fetchAll};