            ${self.test} (event instanceof ${class_name}Impl.${self.event_name}) {
.if ( cant_happen )
                throw new CantHappenException("${self.state_name} -> ${self.event_name}: Event cannot happen");
.elif ( event_ignored )
                /* ${self.state_name} -> ${self.event_name}: Event ignored */ 
.else
                ${self.end_state_name}_entry_action(${parameter_list});
                setCurrentState(${self.end_state_name});
            }