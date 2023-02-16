#[typeshare]
#[typeshare(swift = "Equatable, Codable")]
#[serde(tag = "type", content = "content")]
pub enum BestHockeyTeams {
    MontrealCanadiens,
    Lies(String),
}