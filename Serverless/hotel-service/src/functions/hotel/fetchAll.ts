import { Hotel } from "src/entities/hotel.entity";
import { fetchAll } from "./hotel-service";
import { successResponse } from "./response";

const fetchAllHotel=async(_event)=>{
const  hotels:Hotel[]=await fetchAll();
return successResponse({hotels});
}
export const main=fetchAllHotel;




