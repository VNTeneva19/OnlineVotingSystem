USE voting_system
CREATE LOGIN [admin] WITH PASSWORD = 'admin'

CREATE USER [admin] FOR LOGIN [admin]


GRANT SELECT TO [admin]
GRANT UPDATE TO [admin]
