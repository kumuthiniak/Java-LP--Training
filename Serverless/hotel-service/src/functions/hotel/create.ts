import { ValidatedEventAPIGatewayProxyEvent } from "@libs/api-gateway";
import { Hotel } from "src/entities/hotel.entity";
import { middyfy } from '@libs/lambda';
import schema from "./schema";
import { successResponse } from "./response";
import { create } from "./hotel-service";


const createHotel: ValidatedEventAPIGatewayProxyEvent<typeof schema> = async (event) => {
    const hotel:Hotel=event.body as any as Hotel;
    const hot=await create(hotel);
    return successResponse({hotel});
   
};
    export const main = middyfy(createHotel);