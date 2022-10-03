import { Hotel } from "src/entities/hotel.entity";
import { fetch } from "./hotel-service";
import { successResponse } from "./response";

const fetchHotel=async(event)=>{
    const hotel:Hotel=await fetch(event.pathParameters.hotelId);
    return successResponse({hotel});
    }
    export const main=fetchHotel;