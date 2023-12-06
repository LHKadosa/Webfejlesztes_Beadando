import axios from "axios"
import {baseUrl} from "./baseUrl.js"

export class ItemController{
    static async createItem(itemDTO){
        const output = await axios.post(`${baseUrl}/items/createItem`, itemDTO)
        return output.data
    }

    static async getAll(){
        const output = await axios.get(`${baseUrl}/items/getAll`)
        return output.data
    }

    static async updateItem(itemDTO){
        const output = await axios.patch(`${baseUrl}/items/updateItem`, itemDTO)
        return output.data
    }

    static async deleteItem(itemDTO){
        const output = await axios.delete(`${baseUrl}/items/deleteItem`, {data: itemDTO})
        return output.data
    }
}