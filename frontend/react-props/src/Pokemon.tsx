import "./Pokemon.css";

type PokemonProps = {
    name: string;
    weight: number;
    height: number;
    imageUrl: string;
}


export default function Pokemon(props: PokemonProps) {
    // Destructuring:
    // const { name, weight, height, imageUrl } = props;


    return (
        <section>
            <h2>{props.name}</h2>
            <p>Weight: {props.weight}</p>
            <p>Height: {props.height}</p>
            <img alt={props.name}
                 src={props.imageUrl}/>
        </section>
    )
}