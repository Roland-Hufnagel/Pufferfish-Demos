import './App.css'
import axios from "axios";
import {useState} from "react";

type Character = {
    name: string,
    image: string,
}

export default function App() {
    const [char, setChar] = useState<Character | undefined>()
    const [isLoading, setIsLoading] = useState(false)
    console.log(char);
    const elvis = {
        name: "Elvis",
        job: "Singer",
    }

    function getRick() {
        setIsLoading(true);
        axios.get<Character>("https://rickandmortyapi.com/api/character/1")
            .then((response) => {
                console.log(response.data);
                setChar(response.data);
            })
            .catch((error) => {
                console.log(error)
            })
            .finally(() => {
                setIsLoading(false)
            });


    }

    function sendData() {
        axios.post("https://rickandmortyapi.com/api/character/1", elvis)
            .then((response) => {

                console.log(response.data)
            })
            .catch((error) => {
                console.log(error)
            })
        /*        axios.delete("https://reqres.in/api/users/55")
                    .then((response) => {
                        console.log(response.data)
                    })*/
    }

    if (isLoading) {
        return <h2>is loading...</h2>
    }
    return (
        <>
            <h1>Best Page</h1>
            <button onClick={getRick}>Get Rick</button>
            <button onClick={sendData}>Send data</button>
            {char && <img alt={char.name} src={char.image}/>}
        </>
    )
}

