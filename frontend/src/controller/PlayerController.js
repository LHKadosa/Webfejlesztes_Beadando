import axios from "axios"
import { baseUrl } from "./baseUrl"

export class PlayerController {

    static async createPlayer(playerDTO){
        const output = await axios.post(`${baseUrl}/players/createPlayer`,playerDTO)
        return output.data
    }

    static async getAll(){
        const output = await axios.get(`${baseUrl}/players/getAll`)
        return output.data
    }

    static async updatePlayer(playerDTO){
        const output = await axios.patch(`${baseUrl}/players/updatePlayer`, playerDTO)
        return output.data
    }

    static async deletePlayer(playerDTO){
        const output = await axios.delete(`${baseUrl}/players/deletePlayer`, { data: playerDTO})
        return output.data
    }
}