import './crud.css'
import CRUDTable,
    * as reactCrudTable from 'react-crud-table';
import { ItemController } from '../controller/ItemController';
import { Link } from 'react-router-dom';

const DescriptionRenderer = ({field})=> <textarea {...field} />;

const styles = {
    container: {margin: 'auto', width: 'fit-content'},
};

export function ItemView(){
    return (
        <div style={styles.container}>
            <CRUDTable
                caption="Items"
                fetchItems={()=>ItemController.getAll()}
            >
                <reactCrudTable.Fields>
                    <reactCrudTable.Field
                        name="ID"
                        label="ID"
                        hideInCreateForm
                        readOnly
                    />
                    <reactCrudTable.Field
                        name="name"
                        label="Name"
                        placeholder="name..."
                    />
                    <reactCrudTable.Field
                        name="type"
                        label="Type"
                        placeholder="type..."
                    />
                    <reactCrudTable.Field
                        name="ability"
                        label="Ability"
                        placeholder="ability..."
                    />
                    <reactCrudTable.Field
                        name="playerId"
                        label="Player ID"
                    />
                </reactCrudTable.Fields>
                <reactCrudTable.CreateForm
                    title="Item Creation Panel"
                    message="Add item detail:"
                    trigger="New Item"
                    onSubmit={ItemController.createItem}
                    submitText="Create"
                    validate={(values) =>{
                        const errors = {};
                        if(!values.playerId){
                            errors.title = 'Player ID not added';
                        }
                        return errors;
                    }}
                />
                <reactCrudTable.UpdateForm
                    title="Item Edit Panel"
                    message="Edit item detail:"
                    trigger="Edit"
                    onSubmit={ItemController.updateItem}
                    submitText="Edit"
                />
                <reactCrudTable.DeleteForm
                    title="Item Remove Panel"
                    message="Are you sure you want to delete this Item?"
                    trigger="Delete"
                    onSubmit={ItemController.deleteItem}
                    submitText="Delete"
                />
            </CRUDTable>
            <Link to="/players">Go to Players page</Link>
        </div>
    );
}