import './crud.css'
import CRUDTable,
    * as reactCrudTable from 'react-crud-table';
import { PlayerController } from '../controller/PlayerController';
import { Link } from 'react-router-dom';

const DescriptionRenderer = ({field}) => <textarea {...field} />;

const style={
    container: {margin:'auto', width: 'fit-content'},
};

export function PlayerView(){
    return(
        <div style={style.container}>

            <CRUDTable
                caption="PLAYER TABLE"
                fetchItems={()=>PlayerController.getAll()}
            >
                <reactCrudTable.Fields>
                    <reactCrudTable.Field
                        name="ID"
                        label="ID"
                        hideInCreateForm
                        readOnly
                    />
                    <reactCrudTable.Field
                        name="username"
                        label="Username"
                        placeholder="name..."
                    />
                    <reactCrudTable.Field
                        name="password"
                        label="Password"
                        placeholder="password..."
                    />
                    <reactCrudTable.Field
                        name="health"
                        label="Health"
                        placeholder="health..."
                    />
                    <reactCrudTable.Field
                        name="experience"
                        label="Experience"
                        placeholder="experience..."
                    />
                </reactCrudTable.Fields>
                <reactCrudTable.CreateForm
                    title="Player Creation Panel"
                    message="Add player detail:"
                    trigger="New player"
                    onSubmit={PlayerController.createPlayer}
                    submitText="Create"
                />
                <reactCrudTable.UpdateForm
                    title="Player Edit Panel"
                    message="Edit player detail:"
                    trigger="Edit"
                    onSubmit={PlayerController.updatePlayer}
                    submitText="Edit"
                />
                <reactCrudTable.DeleteForm
                    title="Player Delete Panel"
                    message="Are you sure you want to delete this Player?"
                    trigger="Delete"
                    onSubmit={PlayerController.deletePlayer}
                    submitText="Delete"
                />
            </CRUDTable>
            <Link to="/items">Go to Items page</Link>
        </div>

    );
}