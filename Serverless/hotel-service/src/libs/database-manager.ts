import { DataSource } from "typeorm";
import { EntityManager } from "typeorm/entity-manager/EntityManager";
import { Hotel } from '../entities/hotel.entity';

let dataSource:DataSource;
const getDatabaseConnection = async (): Promise<EntityManager> => { 
if(dataSource && dataSource.isInitialized){
    console.log('Already Connection Created! Using Same Connection!');
    return dataSource.manager;
    }else{
    console.log('No DB Connection Found! Creating New Connection!');
    dataSource=new DataSource({
    applicationName:'hotel-service',
    type:'postgres',
    host:process.env.DBHOSTNAME,
    database:process.env.DBNAME,
    username:process.env.DBUSERNAME,
    password:process.env.DBPASSWORD,
    port: +process.env.DBPORT,
    schema:process.env.DBSCHEMA,
    connectTimeoutMS:30000,
    synchronize:true,
    logging:false,
    useUTC:true,
    entities:[Hotel]
    });
    return await dataSource.initialize().then(()=>{
    console.trace('New DB Created!');
    return dataSource.manager;
    }).catch((e)=>{
    console.debug(e,'Error Occured in DB creation');
    throw new Error(e);
    });
    }
    }
    export{getDatabaseConnection};