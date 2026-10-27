import './App.css'
import Pokemon from "./Pokemon.tsx";
import {pokemons} from "./db/data.tsx";

export default function App() {

    return (
        <>
            {/* Pokemon({name: "Clefairy", weight: 75, height:6, imageUrl: ...}) */}
            <Pokemon name={"Clefairy"} weight={75} height={6}
                     imageUrl={"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/versions/generation-i/red-and-blue/35.png"}/>
            <Pokemon name={"Clefairy"} weight={75} height={6}
                     imageUrl={"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/versions/generation-i/red-and-blue/35.png"}/>
            {/*{[<Pokemon name={"Clefairy"} weight={75} height={6}
                       imageUrl={"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/versions/generation-i/red-and-blue/35.png"}/>,
                <Pokemon name={"Clefairy"} weight={75} height={6}
                         imageUrl={"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/versions/generation-i/red-and-blue/35.png"}/>]}*/}
            {
                pokemons.map(pokemon => <Pokemon key={pokemon.id} name={pokemon.name} weight={pokemon.weight}
                                                 height={pokemon.height}
                                                 imageUrl={pokemon.imageUrl}/>)
            }


        </>
    )
}


// Clefairy
// 75
// 6
// "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/versions/generation-i/red-and-blue/35.png"